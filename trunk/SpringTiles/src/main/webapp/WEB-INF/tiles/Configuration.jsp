<html>
<!-- <script type="text/javascript" src="./js/jquery-3.3.1.js"></script> -->

<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
 
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/select/1.2.5/css/select.dataTables.min.css">
<script type="text/javascript" src="https://cdn.datatables.net/select/1.2.5/js/dataTables.select.min.js"></script>

<script type="text/javascript">


$(document).ready(function() {
	
	$('#example').DataTable( {
	     //"ajax": '../ajax/data/arrays.txt',
	     "ajax": '/configuration123/readAll',
	     //"ajax": '../ajax/data/arrays3.txt',
             "columns": [
            	{ "data": "checkbox" },
            	{ "data": "configurationId" },
            	{ "data": "tipoIncident" },
            	{ "data": "descrizione" },
            	{ "data": "dashboard" },
            	{ "data": "firstName" },
            	{ "data": "lastName" },
            	{ "data": "serviceType" },
            	{ "data": "status" },
            	{ "data": "impact" },
            	{ "data": "urgency" },
            	{ "data": "action" },
            	{ "data": "createRequest" },
            	{ "data": "summary" },
            	{ "data": "sorgenteSistema" },
            	{ "data": "assignedGroup" },
            	{ "data": "assignedSupportCompany" },
            	{ "data": "assignedSupportOrganization" }
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
		 "order" : [ [ 1, 'desc' ] ],
	     "lengthMenu" : [ [ 5, 10, 20, 50, -1 ],
					      [ 5, 10, 20, 50, "All" ] 
	                    ],
	     "sort": [2]
	} );
	
	
	
    $('#addbutton').click(function() {
    	alert('hello world');
//      console.log($("#example tr.selected"));
//     	$("#example tr.selected td").each(function(index){
//     		if(index==1)
//     			alert("Valore:["+$(this).text()+"]");
//     	});
		console.log($("#example tr.selected td")[1].innerText);
    });
    
} );



</script>

<body>
<table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                
                <th>checkbox</th>
                <th>configurationId</th>
                <th>tipoIncident</th>
                <th>descrizione</th>
                <th>dashboard</th>
                <th>firstName</th>
                <th>lastName</th>
                <th>serviceType</th>
                <th>status</th>
                <th>impact</th>
                <th>urgency</th>
               <th>action</th>
               <th>createRequest</th>
               <th>summary</th>
               <th>sorgenteSistema</th>
               <th>assignedGroup</th>
               <th>assignedSupportCompany</th>
               <th>assignedSupportOrganization</th>
            </tr>
        </thead>
        <tfoot>
            <tr>
            	<th>checkbox</th>
                <th>configurationId</th>
                <th>tipoIncident</th>
                <th>descrizione</th>
                <th>dashboard</th>
                <th>firstName</th>
                <th>lastName</th>
                <th>serviceType</th>
                <th>status</th>
                <th>impact</th>
                <th>urgency</th>
               <th>action</th>
               <th>createRequest</th>
               <th>summary</th>
               <th>sorgenteSistema</th>
               <th>assignedGroup</th>
               <th>assignedSupportCompany</th>
               <th>assignedSupportOrganization</th>
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
   
</body>
</html>