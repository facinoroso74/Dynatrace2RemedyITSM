<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/select/1.2.5/css/select.dataTables.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/select/1.2.5/js/dataTables.select.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	
	///evidenzia menu
  	$('#menuId').find('a').each(function() {
        console.log($(this).removeClass("active"));
    });
    $('#dashboardConfigurationId').addClass("active");
	    
	$('#example').DataTable( {
	     "ajax": '/dashboard/readAll',
         "columns": [
            	{ "data": "checkbox" },
            	{ "data": "dashboardId" },
            	{ "data": "name" },
            	{ "data": "description" },
            	{ "data": "appUrl" },
            	{ "data": "appUser" },
            	{ "data": "appPwd" }
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
			  return "/addDashboard/";
		});
    });
    
    $('#editbuttonSpan').click(function() {
//     	alert('hello world edit');
      
		var idToEdit=0;
		
    	$("#example tr.selected td").each(function(index){
    		if(index==1){
//     			alert("Valore:["+$(this).text()+"]");
    			idToEdit= $(this).text();
    		}
    	});
		
		if(idToEdit==0){
			alert("Please, select a row!");	
			return;
		}
		
		$(location).attr("href",function() {
			  return "/editDashboard?idToEdit="+idToEdit;
		});
		
    });
    
    $('#removebuttonSpan').click(function() {
    	
		var idToDelete=0;
		
    	$("#example tr.selected td").each(function(index){
    		if(index==1){
    			alert("Valore:["+$(this).text()+"]");
    			idToDelete= $(this).text();
    		}
    	});
		
		if(idToDelete==0){
			alert("Please, select a row!");	
			return;
		}
		request = $.ajax({
		        url: "/dashboard/delete",
		        type: "get",
		        data: { dashboardId: idToDelete}
		})
				
		// Callback handler that will be called on success
		 request.done(function (response, textStatus, jqXHR){
		        // Log a message to the console
		        console.log("Hooray, it worked!");
		        $(location).attr("href",function() {
					  return "/dashboardList/";
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
                <th>dashboardId</th>
                <th>name</th>
                <th>description</th>
                <th>appUrl</th>
                <th>appUser</th>
                <th>appPwd</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
            	 <th>checkbox</th>
                <th>dashboardId</th>
                <th>name</th>
                <th>description</th>
                <th>appUrl</th>
                <th>appUser</th>
                <th>appPwd</th>
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
  