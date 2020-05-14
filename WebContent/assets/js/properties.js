function listProperties(){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/properties/list/",
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	$.each(response, function(key, value) {
    		
    		var lstResults = "<tr><td><a href ='./index.jsp?view=propertyedit&edit="+value.propertyID+"' data-toggle='tooltip' title='View & Edit'><span class='fa fa-pencil-alt fa-fw' aria-hidden='true'></span><span class='sr-only'>View and Edit</span></a></td>" + 
    				"<td>"+value.propertyID+"</td><td>"+value.streetAddress+"</td><td>"+value.city+"</td>" +
    				"<td>"+value.state+"</td><td>"+value.zipcode+"</td><td>"+value.numberOfUnits+"</td>" +
    				"<td>"+value.propertyOwner+"</td></tr>";
       		
    		if($("#postProperty").text()){
    			document.getElementById('postProperty').innerHTML += lstResults;
    		}
    	});
	});
}

function addProperty(){
	
	var streetAddress = $("#streetAddress").val();
	var city = $("#city").val();
	var state = $("#state").val();
	var zipcode = $("#zipcode").val();
	var numberOfUnits = $("#numberOfUnits").val();
	var propertyOwner = $("#propertyOwner").val();
		
	var parms = { streetAddress:streetAddress, city:city, state:state, zipcode:zipcode, numberOfUnits:numberOfUnits, propertyOwner:propertyOwner };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/properties/add/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=propertylist";
	});
}

function updateProperty(){
	
	var streetAddress = $("#streetAddress").val();
	var city = $("#city").val();
	var state = $("#state").val();
	var zipcode = $("#zipcode").val();
	var numberOfUnits = $("#numberOfUnits").val();
	var propertyOwner = $("#propertyOwner").val();
	
	var parms = { propertyID:propertyID, streetAddress:streetAddress, city:city, state:state, zipcode:zipcode, numberOfUnits:numberOfUnits, propertyOwner:propertyOwner };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/properties/update/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=propertylist";
	});
}

function getProperty(propertyID){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/properties/"+propertyID,
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){
    	
    	$("#streetAddress").val(response.streetAddress);
    	$("#city").val(response.city);
    	$("#state").val(response.state);
    	$("#zipcode").val(response.zipcode);
    	$("#numberOfUnits").val(response.numberOfUnits);
    	$("#propertyOwner").val(response.propertyOwner);


	});
}