function listUnits(){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/units/list/",
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	$.each(response, function(key, value) {
    		
    		var lstResults = "<tr><td><a href ='./index.jsp?view=unitedit&edit="+value.unitID+"' data-toggle='tooltip' title='View & Edit'><span class='fa fa-pencil-alt fa-fw' aria-hidden='true'></span><span class='sr-only'>View and Edit</span></a></td>" + 
    				"<td>"+value.unitID+"</td><td>"+value.unitNumber+"</td><td>"+value.rentRate+"</td>" +
    				"<td>"+value.unitProperty+"</td></tr>";
       		
    		if($("#postUnit").text()){
    			document.getElementById('postUnit').innerHTML += lstResults;
    		}
    	});
	});
}

function addUnit(){
	
	var unitNumber = $("#unitNumber").val();
	var rentRate = $("#rentRate").val();
	var unitProperty = $("#unitProperty").val();
		
	var parms = { unitNumber:unitNumber, rentRate:rentRate, unitProperty:unitProperty };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/units/add/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=unitlist";
	});
}

function updateUnit(){
	
	var unitNumber = $("#unitNumber").val();
	var rentRate = $("#rentRate").val();
	var unitProperty = $("#unitProperty").val();
	
	var parms = { unitID:unitID, unitNumber:unitNumber, rentRate:rentRate, unitProperty:unitProperty };
	
	$.ajax({
		url: "../SENG350FinalProject/rest/units/update/",
		type: 'POST',
		dataType : "json",
        contentType: "application/json",
        data: JSON.stringify(parms)
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){

    	window.location = "./index.jsp?view=unitlist";
	});
}

function getUnit(unitID){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/units/"+unitID,
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){
    	
    	$("#unitNumber").val(response.unitNumber);
    	$("#rentRate").val(response.rentRate);
    	$("#unitProperty").val(response.unitProperty);


	});
}

function getTenantUnit(tenantID){
	
	$.ajax({
		url: "../SENG350FinalProject/rest/units/tenants/"+tenantID,
		type: 'GET',
		dataType : "json",
        contentType: "application/json",
	}).fail(function(response) {
		console.log(JSON.stringify(response));

    }).done(function(response){
    	
    	$("#unitNumber").val(response.unitNumber);
    	$("#rentRate").val(response.rentRate);
    	$("#unitProperty").val(response.unitProperty);


	});
}