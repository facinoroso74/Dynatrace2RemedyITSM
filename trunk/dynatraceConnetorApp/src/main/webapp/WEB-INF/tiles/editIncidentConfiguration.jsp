 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
    //evidenzia menu
//     $('#incidentConfigurationID').addClass("active");
//     $('#schedulerManagerLinkId').removeClass("active");
    
    $('#menuId').find('a').each(function() {
        console.log($(this).removeClass("active"));
    });
    $('#incidentConfigurationId').addClass("active");
    
    var idToEdit = <%= request.getParameter("idToEdit") %>;
    //alert("idToEdit:["+idToEdit+"]");
    
    $.ajax({
        url: "/ticketconfiguration/readByID?configurationId="+idToEdit
    }).then(function(data) {
    	//alert("data.id-->"+data.configurationId);
    	$("#configurationId").val(data.configurationId);
    	$("#tipoIncident").val(data.tipoIncident);
    	$("#descrizione").val(data.descrizione);
    	$("#dashboard").val(data.dashboard);
    	$("#firstName").val(data.firstName);
    	$("#lastName").val(data.lastName);
    	$("#serviceType").val(data.serviceType);
    	$("#status").val(data.status);
    	$("#impact").val(data.impact);
    	$("#urgency").val(data.urgency);
    	$("#reportedSource").val(data.reportedSource);
    	$("#action").val(data.action);
    	$("#createRequest").val(data.createRequest);
    	$("#summary").val(data.summary);
    	$("#sorgenteSistema").val(data.sorgenteSistema);
    	$("#assignedGroup").val(data.assignedGroup);
    	$("#assignedSupportCompany").val(data.assignedSupportCompany);
    	$("#assignedSupportOrganization").val(data.assignedSupportOrganization);
    	    	
    	//alert("data.id22-->"+data.configurationId);
       //$('.greeting-id').append(data.id);
       //$('.greeting-content').append(data.content);
    });
    
    $('#saveId').click(function() {
        
	    // Let's select and cache all the fields
	    var $inputs = $( "#newConfigurationId" ).find("input, select, button, textarea");
	
	    $inputs.prop("disabled", false);
	    
	    // Serialize the data in the form
	    var serializedData = $( "#newConfigurationId" ).serialize();
		    
	    alert("serializedData:["+serializedData+"]");
	    // Let's disable the inputs for the duration of the Ajax request.
	    // Note: we disable elements AFTER the form data has been serialized.
	    // Disabled form elements will not be serialized.
	    $inputs.prop("disabled", true);
	
	    // Fire off the request to /form.php
	    request = $.ajax({
	        url: "/ticketconfiguration/put",
	        type: "post",
	        data: serializedData
	    });
	
	    // Callback handler that will be called on success
	    request.done(function (response, textStatus, jqXHR){
	        // Log a message to the console
	        console.log("Updated! It worked!");
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
	        $inputs.prop("disabled", false);
	        
	    });

    });
    
    $('#cancelId').click(function() {
		$(location).attr("href",function() {
			  return "/incidentConfiguration/";
		});
    });
       
 // Fire off the request to /form.php
//     request = $.ajax({
//         url: "/ticketconfiguration/readByID",
//         type: "get",
//         data: { configurationId: idToEdit}
//     });

    // Callback handler that will be called on success
//     request.done(function (response, textStatus, jqXHR){
//         // Log a message to the console
//         console.log("Hooray, it worked!");
        
//         alert("response:["+response+"]");
        
//     });

    // Callback handler that will be called on failure
//     request.fail(function (jqXHR, textStatus, errorThrown){
//         // Log the error to the console
//         alert("error");
//         console.error(
//             "The following error occurred: "+
//             textStatus, errorThrown
//         );
        
//     });
    
    
} );
</script>
 
<form id="newConfigurationId" action="" method="POST">
	<table border="1">
		<tr BGCOLOR="#CCCCFF"><th>COLUMN_NAME</th><th>VALUE</th></tr>
		<tr><td>CONFIGURATION_ID</td><td><input type="TEXT" id="configurationId" name="configuration" disabled></td></tr>
		<tr><td>TIPO_INCIDENT</td><td><input type="TEXT" id="tipoIncident" name="tipoincident" disabled></td></tr>
		<tr><td>DESCRIZIONE</td><td><input type="TEXT" id="descrizione" name="descrizione"></td></tr>
		<tr><td>DASHBOARD</td><td><input type="TEXT" id="dashboard" name="dashboard"></td></tr>
		<tr><td>FIRST_NAME</td><td><input type="TEXT" id="firstName" name="firstName"></td></tr>
		<tr><td>LAST_NAME</td><td><input type="TEXT" id="lastName" name="lastName"></td></tr>
		<tr><td>SERVICE_TYPE</td><td><input type="TEXT" id="serviceType" name="serviceType"></td></tr>
		<tr><td>STATUS</td><td><input type="TEXT" id="status" name="status"></td></tr>
		<tr><td>IMPACT</td><td><input type="TEXT" id="impact" name="impact"></td></tr>
		<tr><td>URGENCY</td><td><input type="TEXT" id="urgency" name="urgency"></td></tr>
		<tr><td>REPORTED_SOURCE</td><td><input type="TEXT" id="reportedSource" name="reportedSource"></td></tr>
		<tr><td>ACTION</td><td><input type="TEXT" id="action" name="action"></td></tr>
		<tr><td>CREATE_REQUEST</td><td><input type="TEXT" id="createRequest" name="createRequest"></td></tr>
		<tr><td>SUMMARY</td><td><input type="TEXT" id="summary" name="summary"></td></tr>
		<tr><td>SORGENTE_SISTEMA</td><td><input type="TEXT" id="sorgenteSistema" name="sorgenteSistema" disabled></td></tr>
		<tr><td>ASSIGNED_GROUP</td><td><input type="TEXT" id="assignedGroup" name="assignedGroup"></td></tr>
		<tr><td>ASSIGNED_SUPPORT_COMPANY</td><td><input type="TEXT" id="assignedSupportCompany" name="assignedSupportCompany"></td></tr>
		<tr><td>ASSIGNED_SUPPORT_ORGANIZATION</td><td><input type="TEXT" id="assignedSupportOrganization" name="assignedSupportOrganization"></td></tr>
	</table>
</form>

<div id="buttons">
	<table>
		<tr><td><input type="button" id="saveId" name="save" value="Save"><td><input type="button" id="cancelId" name="cancel" value="Cancel"></td></tr>
	</table>
</div>