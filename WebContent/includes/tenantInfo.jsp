  <!-- Custom styles for this template-->
  <link href="assets/css/info-style.css" rel="stylesheet">

<h1 class="page-header">Tenant Info</h1>

        <div class="row" id="buffer-row1"></div>
        
        <div class="row" id="info-row1">
  			<div class="column" id="dashboard-column1">
  				<h2 class="column-header" id="info-column-header">Tenant</h2>
	  				<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="firstName">First Name: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="firstName" readonly>
	    					</div>
		  				</div>
	  				</form>
	  				<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="lastName">Last Name: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="lastName" readonly>
	    					</div>
		  				</div>
	  				</form>
	  				<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="phoneNumber">Phone #: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="phoneNumber" readonly>
	    					</div>
		  				</div>
	  				</form>
	  				<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="email">Email: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="email" readonly>
	    					</div>
		  				</div>
	  				</form>
	  				<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="SSN">SSN: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="SSN" readonly>
	    					</div>
		  				</div>
	  				</form>
  			</div>
  			
  			<div class="column" id="dashboard-column2">
  				<h2 class="column-header" id="info-column-header">Resident Unit</h2>
  					<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="unitNumber">Unit Number: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="unitNumber" readonly>
	    					</div>
		  				</div>
	  				</form>
	  				<form class="form-horizontal">
		  				<div class="form-group">
		  					<label for="rentRate">Rent Rate: </label>
		  					<div class="col-sm-10">
		    					<input class="form-control no-border" id="rentRate" readonly>
	    					</div>
		  				</div>
	  				</form>
  			</div>
		</div> 
		
		<div class="row" id="buffer-row1"></div>
		
        <div class="row" id="info-row2">
  			<div class="column" id="dashboard-column1">
  				<h2 class="column-header" id="info-column-header">Property Info</h2>
  				<p>This is where the property info related to the tenant's unit will go.</p>
  			</div>
  			
  			<div class="column" id="dashboard-column2">
  				<h2 class="column-header" id="info-column-header">Property Owner</h2>
  				<p>This is where the owner info related to the tenant's unit's property will go.</p>
  			</div>
		</div> 


<div class="form-group col-xs-12">
    <span>
        <button class="btn btn-primary" type="submit" onclick="window.history.back()" data-toggle="tooltip" title="Back">Back</button>
    </span>
</div>