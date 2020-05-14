function listOwners(){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/owners/list/",
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	$.each(response, function(key, value) {
    		
    		var lstResults = "<tr><td><a href ='./index.jsp?view=owneredit&edit="+value.ownerID+"' data-toggle='tooltip' title='View & Edit'><span class='fa fa-pencil-alt fa-fw' aria-hidden='true'></span><span class='sr-only'>View and Edit</span></a></td>" + 
    				"<td>"+value.ownerID+"</td><td>"+value.firstName+"</td><td>"+value.lastName+"</td>" +
    				"<td>"+value.phoneNumber+"</td><td>"+value.email+"</td><td>"+value.SSN+"</td>" +
    				"<td>"+value.streetAddress+"</td><td>"+value.city+"</td><td>"+value.state+"</td><td>"+value.zipcode+"</td></tr>";
       		
    		if($("#postOwner").text()){
    			document.getElementById('postOwner').innerHTML += lstResults;
    		}
    	});
	});
}

function addOwner(){
	
	var firstName = $("#firstName").val();
	var lastName = $("#lastName").val();
	var phoneNumber = $("#phoneNumber").val();
	var email = $("#email").val();
	var SSN = $("#SSN").val();
	var streetAddress = $("#streetAddress").val();
	var city = $("#city").val();
	var state = $("#state").val();
	var zipcode = $("#zipcode").val();
	
	var parms = { firstName:firstName, lastName:lastName, phoneNumber:phoneNumber, email:email, SSN:SSN, streetAddress:streetAddress, city:city, state:state, zipcode:zipcode };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/owners/add/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=ownerlist";
	});
}

function updateOwner(){
	
	var firstName = $("#firstName").val();
	var lastName = $("#lastName").val();
	var phoneNumber = $("#phoneNumber").val();
	var email = $("#email").val();
	var SSN = $("#SSN").val();
	var streetAddress = $("#streetAddress").val();
	var city = $("#city").val();
	var state = $("#state").val();
	var zipcode = $("#zipcode").val();
	
	var parms = { ownerID:ownerID, firstName:firstName, lastName:lastName, phoneNumber:phoneNumber, email:email, SSN:SSN, streetAddress:streetAddress, city:city, state:state, zipcode:zipcode };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/owners/update/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=ownerlist";
	});
}

function getOwner(ownerID){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/owners/"+ownerID,
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
    	$("#streetAddress").val(response.streetAddress);
    	$("#city").val(response.city);
    	$("#state").val(response.state);
    	$("#zipcode").val(response.zipcode);


	});
}