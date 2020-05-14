$(document).ready(function(){

	listOwners();
	listProperties();
	listUnits();
	listTenants();
	
	view = getQueryStringVariable('view');
	
	if(view == 'owneredit'){
		ownerID = getQueryStringVariable('edit');
		getOwner(ownerID);
	}
	if(view == 'propertyedit'){
		propertyID = getQueryStringVariable('edit');
		getProperty(propertyID);
	}
	if(view == 'unitedit'){
		unitID = getQueryStringVariable('edit');
		getUnit(unitID);
	}
	if(view == 'tenantedit'){
		tenantID = getQueryStringVariable('edit');
		getTenant(tenantID);
	}
	if(view == 'tenantinfo'){
		tenantID = getQueryStringVariable('info');
		getTenant(tenantID);
		
	}
	
});


var getQueryStringVariable = function ( field, url ) {
	var href = url ? url : window.location.href;
	var reg = new RegExp( '[?&]' + field + '=([^&#]*)', 'i' );
	var string = reg.exec(href);
	return string ? string[1] : null;
};


