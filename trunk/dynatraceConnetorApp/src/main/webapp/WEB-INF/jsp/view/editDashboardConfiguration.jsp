 <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
$(document).ready(function() {
    //evidenzia menu
//     $('#incidentConfigurationID').addClass("active");
//     $('#schedulerManagerLinkId').removeClass("active");
    
    $('#menuId').find('a').each(function() {
        console.log($(this).removeClass("active"));
    });
    $('#dashboardConfigurationId').addClass("active");
    
    var idToEdit = <%= request.getParameter("idToEdit") %>;
    //alert("idToEdit:["+idToEdit+"]");
    
    $.ajax({
        url: "/dashboard/read?dashboardId="+idToEdit
    }).then(function(data) {
    	//alert("data.id-->"+data.configurationId);
    	$("#dashboardId").val(data.dashboardId);
    	$("#name").val(data.name);
    	$("#description").val(data.description);
    	$("#appUrl").val(data.appUrl);
    	$("#appUser").val(data.appUser);
    	$("#appPwd").val(data.appPwd);
    	    	
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
	        url: "/dashboard/put",
	        type: "post",
	        data: serializedData
	    });
	
	    // Callback handler that will be called on success
	    request.done(function (response, textStatus, jqXHR){
	        // Log a message to the console
	        console.log("Updated! It worked!");
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
	        $inputs.prop("disabled", false);
	        
	    });

    });
    
    $('#cancelId').click(function() {
		$(location).attr("href",function() {
			  return "/dashboardList/";
		});
    });
       
} );
</script>
 
<form id="newConfigurationId" action="" method="POST">
	<table border="1">
	 	<tr BGCOLOR="#CCCCFF"><th>COLUMN_NAME</th><th>VALUE</th></tr>
	 	<tr><td>DASHBOARD_ID</td><td><input type="TEXT" id="dashboardId" name="dashboardId" disabled></td></tr>
		<tr><td>NAME</td><td><input type="TEXT" id="name" name="name"></td></tr>
		<tr><td>DESCRIPTION</td><td><input type="TEXT" id="description" name="description"></td></tr>
		<tr><td>APPURL</td><td><input type="TEXT" id="appUrl" name="appUrl"></td></tr>
		<tr><td>APPUSER</td><td><input type="TEXT" id="appUser" name="appUser"></td></tr>
		<tr><td>APPWD</td><td><input type="TEXT" id="appPwd" name="appPwd"></td></tr>
	</table>
	
</form>

<div id="buttons">
	<table>
		<tr><td><input type="button" id="saveId" name="save" value="Save"><td><input type="button" id="cancelId" name="cancel" value="Cancel"></td></tr>
	</table>
</div>