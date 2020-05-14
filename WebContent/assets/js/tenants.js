function listTenants(){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/tenants/list/",
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	$.each(response, function(key, value) {
    		
    		var lstResults = "<tr><td><a href ='./index.jsp?view=tenantedit&edit="+value.tenantID+"' data-toggle='tooltip' title='View & Edit'><span class='fa fa-pencil-alt fa-fw' aria-hidden='true'></span><span class='sr-only'>View and Edit</span></a></td>" + 
    				"<td><a href ='./index.jsp?view=tenantinfo&info="+value.tenantID+"' data-toggle='tooltip' title='More Info'><span class='fa fa-clipboard-list fa-fw' aria-hidden='true'></span><span class='sr-only'>More Info</span></a></td>" +
    				"<td>"+value.tenantID+"</td><td>"+value.firstName+"</td><td>"+value.lastName+"</td>" +
    				"<td>"+value.phoneNumber+"</td><td>"+value.email+"</td><td>"+value.SSN+"</td>" +
    				"<td>"+value.tenantUnit+"</td></tr>";
       		
    		if($("#postTenant").text()){
    			document.getElementById('postTenant').innerHTML += lstResults;
    		}
    	});
	});
}

function addTenant(){
	
	var firstName = $("#firstName").val();
	var lastName = $("#lastName").val();
	var phoneNumber = $("#phoneNumber").val();
	var email = $("#email").val();
	var SSN = $("#SSN").val();
	var tenantUnit = $("#tenantUnit").val();
		
	var parms = { firstName:firstName, lastName:lastName, phoneNumber:phoneNumber, email:email, SSN:SSN, tenantUnit:tenantUnit };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/tenants/add/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=tenantlist";
	});
}

function updateTenant(){
	
	var firstName = $("#firstName").val();
	var lastName = $("#lastName").val();
	var phoneNumber = $("#phoneNumber").val();
	var email = $("#email").val();
	var SSN = $("#SSN").val();
	var tenantUnit = $("#tenantUnit").val();
	
	var parms = { tenantID:tenantID, firstName:firstName, lastName:lastName, phoneNumber:phoneNumber, email:email, SSN:SSN, tenantUnit:tenantUnit };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/tenants/update/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=tenantlist";
	});
}

function getTenant(tenantID){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/tenants/"+tenantID,
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){
    	
    	$("#firstName").val(response.firstName);
    	$("#lastName").val(response.lastName);
    	$("#phoneNumber").val(response.phoneNumber);
    	$("#email").val(response.email);
    	$("#SSN").val(response.SSN);
    	$("#tenantUnit").val(response.tenantUnit);


	});
}

function getTenantInfo(tenantID){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/tenants/info/"+tenantID,
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));
		System.out.println("getTenantInfo() of tenants.js failed");

    }).done(function(response){
    	
    	$("#firstName").val(response.firstName);
    	$("#lastName").val(response.lastName);
    	$("#phoneNumber").val(response.phoneNumber);
    	$("#email").val(response.email);
    	$("#SSN").val(response.SSN);
    	$("#unitNumber").val(response.unitNumber);


	});
}