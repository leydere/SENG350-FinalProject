<h1 class="page-header">Edit Property</h1>

<div class="form-group col-xs-12 col-md-6">
        <label for="streetAddress">Address</label>
        <input type="text" class="form-control" id="streetAddress" value="" required autofocus>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="city">City</label>
    <input class="form-control" id="city" required></input>
</div>
<div class="form-group col-xs-12 col-md-6">
	<label for="state">State</label>
    <input type="text" class="form-control" id="state" required>
</div>
<div class="form-group col-xs-12 col-md-6">
	<label for="zipcode">Zip Code</label>
    <input type="text" class="form-control" id="zipcode" required>
</div>
<div class="form-group col-xs-12 col-md-6">
	<label for="numberOfUnits"># of Units</label>
    <input type="text" class="form-control" id="numberOfUnits" required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="propertyOwner">Owner ID</label>
    <input type="text" class="form-control" id="propertyOwner" autofocus required>
</div>


<div class="form-group col-xs-12">
    <span>
        <button class="btn btn-primary" type="submit" onclick=updateProperty(); data-toggle="tooltip" title="Save Changes">Save Changes</button>
    </span>
    <span>
        <button class = "btn btn-link" type="button" onclick="window.history.back()" data-toggle="tooltip" title="Cancel">Cancel</button>
    </span>
</div>