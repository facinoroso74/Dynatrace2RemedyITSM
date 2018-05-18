 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
    //evidenzia menu
    $('#incidentConfigurationID').addClass("active");
    $('#schedulerManagerLinkId').removeClass("active");
    
    $.ajax({
        url: "/ticketconfiguration/readByID?configurationId=5"
    }).then(function(data) {
    	alert("data.id-->"+data.configurationId);
    	$("#configurationID").val(data.configurationId);
    	$("#tipoincidentId").val(data.tipoIncident);
    	$("#descrizioneId").val(data.descrizione);
    	$("#dashboardId").val(data.dashboard);
    	$("#firstNameId").val(data.firstName);
    	$("#lastNameId").val(data.lastName);
    	$("#serviceTypeId").val(data.serviceType);
    	$("#statusId").val(data.status);
    	$("#impactId").val(data.impact);
    	$("#urgencyId").val(data.urgency);
    	$("#reportedSourceId").val(data.reportedSource);
    	$("#actionId").val(data.action);
    	$("#createRequestId").val(data.createRequest);
    	$("#summaryId").val(data.summary);
    	$("#sorgenteSistemaId").val(data.sorgenteSistema);
    	$("#assignedGroupId").val(data.assignedGroup);
    	$("#assignedSupportCompanyId").val(data.assignedSupportCompany);
    	$("#assignedSupportOrganizationId").val(data.assignedSupportOrganization);
    	    	
    	alert("data.id22-->"+data.configurationId);
       //$('.greeting-id').append(data.id);
       //$('.greeting-content').append(data.content);
    });
    
    $('#saveId').click(function() {
    	alert('hello saveId');
//      console.log($("#example tr.selected"));
//     	$("#example tr.selected td").each(function(index){
//     		if(index==1)
//     			alert("Valore:["+$(this).text()+"]");
//     	});
//		console.log($("#example tr.selected td")[1].innerText);
		
		//aggiungere la chiamata all'insert
		$(location).attr("href",function() {
			  return "/incidentConfiguration/";
		});
    });
    
    $('#cancelId').click(function() {
    	alert('hello Cancel');
//      console.log($("#example tr.selected"));
//     	$("#example tr.selected td").each(function(index){
//     		if(index==1)
//     			alert("Valore:["+$(this).text()+"]");
//     	});
//		console.log($("#example tr.selected td")[1].innerText);
		
		$(location).attr("href",function() {
			  return "/incidentConfiguration/";
		});
    });
    
} );
</script>
 

<table border="1">
<tr BGCOLOR="#CCCCFF"><th>COLUMN_NAME</th><th>VALUE</th></tr>
<tr><td>CONFIGURATION_ID</td><td><input type="TEXT" id="configurationID" name="configuration" disabled></td></tr>
<tr><td>TIPO_INCIDENT</td><td><input type="TEXT" id="tipoincidentId" name="tipoincident"></td></tr>
<tr><td>DESCRIZIONE</td><td><input type="TEXT" id="descrizioneId" name="descrizione"></td></tr>
<tr><td>DASHBOARD</td><td><input type="TEXT" id="dashboardId" name="dashboard"></td></tr>
<tr><td>FIRST_NAME</td><td><input type="TEXT" id="firstNameId" name="firstName"></td></tr>
<tr><td>LAST_NAME</td><td><input type="TEXT" id="lastNameId" name="lastName"></td></tr>
<tr><td>SERVICE_TYPE</td><td><input type="TEXT" id="serviceTypeId" name="serviceType"></td></tr>
<tr><td>STATUS</td><td><input type="TEXT" id="statusId" name="status"></td></tr>
<tr><td>IMPACT</td><td><input type="TEXT" id="impactId" name="impact"></td></tr>
<tr><td>URGENCY</td><td><input type="TEXT" id="urgencyId" name="urgency"></td></tr>
<tr><td>REPORTED_SOURCE</td><td><input type="TEXT" id="reportedSourceId" name="reportedSource"></td></tr>
<tr><td>ACTION</td><td><input type="TEXT" id="actionId" name="action"></td></tr>
<tr><td>CREATE_REQUEST</td><td><input type="TEXT" id="createRequestId" name="createRequest"></td></tr>
<tr><td>SUMMARY</td><td><input type="TEXT" id="summaryId" name="summary"></td></tr>
<tr><td>SORGENTE_SISTEMA</td><td><input type="TEXT" id="sorgenteSistemaId" name="sorgenteSistema"></td></tr>
<tr><td>ASSIGNED_GROUP</td><td><input type="TEXT" id="assignedGroupId" name="assignedGroup"></td></tr>
<tr><td>ASSIGNED_SUPPORT_COMPANY</td><td><input type="TEXT" id="assignedSupportCompanyId" name="assignedSupportCompany"></td></tr>
<tr><td>ASSIGNED_SUPPORT_ORGANIZATION</td><td><input type="TEXT" id="assignedSupportOrganizationId" name="assignedSupportOrganization"></td></tr>
</table>

<div id="buttons">
	<table>
		<tr><td><input type="button" id="saveId" name="save" value="Save"><td><input type="button" id="cancelId" name="cancel" value="Cancel"></td></tr>
	</table>
</div>