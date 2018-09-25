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
    
    
    $('#saveId').click(function() {
    
	    // Let's select and cache all the fields
	    var $inputs = $( "#newConfigurationId" ).find("input, select, button, textarea");
	
	    // Serialize the data in the form
	    var serializedData = $( "#newConfigurationId" ).serialize();
	
	    //alert("serializedData:["+serializedData+"]");
	    // Let's disable the inputs for the duration of the Ajax request.
	    // Note: we disable elements AFTER the form data has been serialized.
	    // Disabled form elements will not be serialized.
	    $inputs.prop("disabled", true);
	
	    // Fire off the request to /form.php
	    request = $.ajax({
	        url: "/ticketconfiguration/addNew",
	        type: "post",
	        data: serializedData
	    });
	
	    // Callback handler that will be called on success
	    request.done(function (response, textStatus, jqXHR){
	        // Log a message to the console
	        console.log("Hooray, it worked!");
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
    
} );
</script>

<form id="newConfigurationId" action="" method="POST">

	<table border="1">
		<tr BGCOLOR="#CCCCFF"><th>COLUMN_NAME</th><th>VALUE</th></tr>
		
		<tr><td>ID_EVENTO</td><td><input type="TEXT" id="idEvento" name="idEvento"></td></tr>
		<tr><td>DESCRIZIONE</td><td><input type="TEXT" id="descrizione" name="descrizione"></td></tr>
		<tr><td>DASHBOARD</td><td><input type="TEXT" id="dashboard" name="dashboard"></td></tr>
		<tr><td>IMPACT</td><td><input type="TEXT" id="impact" name="impact"></td></tr>
		<tr><td>URGENCY</td><td><input type="TEXT" id="urgency" name="urgency"></td></tr>
		<tr><td>SORGENTE_SISTEMA</td><td><input type="TEXT" id="sorgenteSistema" name="sorgenteSistema"></td></tr>
	</table>
</form>
<div id="buttons">
		<table>
			<tr><td><input type="button" id="saveId" name="save" value="Save"><td><input type="button" id="cancelId" name="cancel" value="Cancel"></td></tr>
		</table>
	</div>