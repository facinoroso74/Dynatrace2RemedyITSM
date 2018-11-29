<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/select/1.2.5/css/select.dataTables.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/select/1.2.5/js/dataTables.select.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
 
	//evidenzia menu
    $('#menuId').find('a').each(function() {
        console.log($(this).removeClass("active"));
    });
    $('#incidentConfigurationId').addClass("active");
    
    
	$('#example').DataTable( {
	     "ajax": '/ticketconfiguration/readAll',
         "columns": [
	        	 { "data": "checkbox" },
	         	{ "data": "configurationId" },
	         	{ "data": "idEvento" },
	         	{ "data": "descrizione" },
	         	{ "data": "dashboard" },
	         	{ "data": "impact" },
	         	{ "data": "urgency" },
	         	{ "data": "classificazione" },
	         	{ "data": "hpdci" },
	         	{ "data": "sorgenteSistema" },
// 	         	{ "data": "categorizationTier1" },
//             	{ "data": "categorizationTier2" },
//             	{ "data": "categorizationTier3" },
            ],
 	    	 "pageLength": 20,
 	    	
			 "columnDefs" : [ {
					"orderable" : false,
					"className" : 'select-checkbox',
					"targets" : 0
				} ],
			 "select" : {
					"style" : 'os',
					"selector" : 'td:first-child'
				},
		 "order" : [ [ 1, 'asc' ] ],
	     "lengthMenu" : [ [ 5, 10, 20, 50, -1 ],
					      [ 5, 10, 20, 50, "All" ] 
	                    ],
	     "sort": [2]
	} );
		
    $('#addbutton').click(function() {
		$(location).attr("href",function() {
			  return "/addIncidentConfiguration/";
		});
    });
    
    $('#editbuttonSpan').click(function() {
    	//alert('hello world edit');
      
		var idToEdit=0;
		
    	$("#example tr.selected td").each(function(index){
    		if(index==1){
    		//	alert("Valore:["+$(this).text()+"]");
    			idToEdit= $(this).text();
    		}
    	});
		
		if(idToEdit==0){
			alert("Please, select a row!");	
			return;
		}
		
		$(location).attr("href",function() {
			  return "/editIncidentConfiguration?idToEdit="+idToEdit;
		});
		
    });
    
    $('#removebuttonSpan').click(function() {
    	
		var idToDelete=0;
		
    	$("#example tr.selected td").each(function(index){
    		if(index==1){
    			//alert("Valore:["+$(this).text()+"]");
    			idToDelete= $(this).text();
    		}
    	});
		
		if(idToDelete==0){
			alert("Please, select a row!");	
			return;
		}
		request = $.ajax({
		        url: "/ticketconfiguration/delete",
		        type: "get",
		        data: { configurationId: idToDelete}
		})
				
		// Callback handler that will be called on success
		 request.done(function (response, textStatus, jqXHR){
		        // Log a message to the console
		        //console.log("Hooray, it worked!");
		        $(location).attr("href",function() {
					  return "/incidentConfiguration/";
				});
		 });
		
		 // Callback handler that will be called on failure
		 request.fail(function (jqXHR, textStatus, errorThrown){
		        // Log the error to the console
		        alert("error");
		        console.error(
		            "The following error occurred: "+
		            textStatus, errorThrown
		        );
		        
		 });
		
		 // Callback handler that will be called regardless
		 // if the request failed or succeeded
		 request.always(function () {
		        // Reenable the inputs
		        //$inputs.prop("disabled", false);
		        
		 });
    }); 
	
   
    
    
} );



</script>


<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                 <th>checkbox</th>
                <th>configurationId</th>
                <th>idEvento</th>
                <th>descrizione</th>
                <th>dashboard</th>
                <th>impact</th>
                <th>urgency</th>
                <th>classificazione</th>
                <th>hpdci</th>
                <th>sorgenteSistema</th>
<!--                  <th>categorizationTier1</th> -->
<!--                 <th>categorizationTier2</th> -->
<!--                 <th>categorizationTier3</th> -->
            </tr>
        </thead>
        <tfoot>
            <tr>
            	 <th>checkbox</th>
                <th>configurationId</th>
                <th>idEvento</th>
                <th>descrizione</th>
                <th>dashboard</th>
                <th>impact</th>
                <th>urgency</th>
                <th>classificazione</th>
                <th>hpdci</th>
                <th>sorgenteSistema</th>
<!--                 <th>categorizationTier1</th> -->
<!--                 <th>categorizationTier2</th> -->
<!--                 <th>categorizationTier3</th> -->
            </tr>
        </tfoot>
    </table>
    
    <div id="addbuttonDiv">
    	<span id="addbuttonSpan">
    		<input type="button" id="addbutton" value="ADD"></input>
    	</span>
    	<span id="removebuttonSpan">
    		<input type="button" id="removebutton" value="DELETE"></input>
    	</span>
    	<span id="editbuttonSpan">
    		<input type="button" id="editbutton" value="EDIT"></input>
    	</span>
    </div>
  