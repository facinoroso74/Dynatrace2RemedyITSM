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
    $('#dynatraceIncidentConfigurationId').addClass("active");
  
	$('#example').DataTable( {
	     "ajax": '/dynatraceIncident/readAll',
         "columns": [
            	{ "data": "checkbox" },
            	{ "data": "id" },
            	{ "data": "name" },
            	{ "data": "incidentType" },
            	{ "data": "dashboardName" },
            	{ "data": "heatfield" },
            	{ "data": "state" },
            	{ "data": "startEvent"},
            	{ "data": "duration" },
            	{ "data": "endEvent" },
            	{ "data": "source" },
            	{ "data": "confimedBy" },
            	{ "data": "confirmation" },
            	{ "data": "sensitivity" },
            	{ "data": "conditions" },
            	{ "data": "thresholds" },
            	{ "data": "actions" },
            	{ "data": "measures" },
            	{ "data": "dataIns" },
            	{ "data": "dataUpdate" },
            	{ "data": "remedyTicketID" },
            	{ "data": "remedyTicketIDStatus" },
            	{ "data": "remedyTicketCreateDate" },
            	
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
				
				, 
		 "buttons": [
		            {
		                "extend": 'copyHtml5',
		                "exportOptions": { "orthogonal": 'export' }
		            }
		        ]
	} );
		
    $('#removebuttonSpan').click(function() {
    	
		var idToDelete=0;
		
    	$("#example tr.selected td").each(function(index){
    		if(index==1){
    			idToDelete= $(this).text();
    		}
    	});
		
		if(idToDelete==0){
			alert("Please, select a row!");	
			return;
		}
		request = $.ajax({
		        url: "/dynatraceIncident/delete",
		        type: "get",
		        data: { dynatraceIncidentId: idToDelete}
		})
				
		// Callback handler that will be called on success
		 request.done(function (response, textStatus, jqXHR){
		        // Log a message to the console
		        $(location).attr("href",function() {
					  return "/dynatraceIncidents/";
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
                <th>id</th>
                <th>name</th>
                <th>incidentType</th>
                <th>dashboardName</th>
                <th>heatfield</th>
                <th>state</th>
                <th>startEvent</th>
                <th>duration</th>
                <th>endEvent</th>
                <th>source</th>
                <th>confimedBy</th>
                <th>confirmation</th>
                <th>sensitivity</th>
                <th>conditions</th>
                <th>thresholds</th>
                <th>actions</th>
                <th>measures</th>
                <th>dataIns</th>
                <th>dataUpdate</th>
                <th>remedyTicketID</th>
                <th>remedyTicketIDStatus</th>
                <th>remedyTicketCreateDate</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
                <th>checkbox</th>
                <th>id</th>
                <th>name</th>
                <th>incidentType</th>
                <th>dashboardName</th>
                <th>heatfield</th>
                <th>state</th>
                <th>startEvent</th>
                <th>duration</th>
                <th>endEvent</th>
                <th>source</th>
                <th>confimedBy</th>
                <th>confirmation</th>
                <th>sensitivity</th>
                <th>conditions</th>
                <th>thresholds</th>
                <th>actions</th>
                <th>measures</th>
                <th>dataIns</th>
                <th>dataUpdate</th>
                <th>remedyTicketID</th>
                <th>remedyTicketIDStatus</th>
                <th>remedyTicketCreateDate</th>
            </tr>
        </tfoot>
    </table>
    
    <div id="addbuttonDiv">
    	<span id="removebuttonSpan">
    		<input type="button" id="removebutton" value="DELETE"></input>
    	</span>
    </div>
  