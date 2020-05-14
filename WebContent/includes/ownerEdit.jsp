<h1 class="page-header">Edit Owner</h1>

<div class="form-group col-xs-12 col-md-6">
        <label for="firstName">First Name</label>
        <input type="text" class="form-control" id="firstName" value="" required autofocus>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="lastName">Last Name</label>
    <input class="form-control" id="lastName" required></input>
</div>
<div class="form-group col-xs-12 col-md-6">
	<label for="phoneNumber">Phone #</label>
    <input type="text" class="form-control" id="phoneNumber" required>
</div>
<div class="form-group col-xs-12 col-md-6">
	<label for="email">Email</label>
    <input type="text" class="form-control" id="email" required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="SSN">SSN</label>
    <input type="text" class="form-control" id="SSN" required >
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="streetAddress">Address</label>
    <input type="text" class="form-control" id="streetAddress" autofocus required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="city">City</label>
    <input type="text" class="form-control" id="city" autofocus required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="state">State</label>
    <input type="text" class="form-control" id="state" autofocus required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="zipcode">Zip Code</label>
    <input type="text" class="form-control" id="zipcode" autofocus required>
</div>


<div class="form-group col-xs-12">
    <span>
        <button class="btn btn-primary" type="submit" onclick=updateOwner(); data-toggle="tooltip" title="Save Changes">Save Changes</button>
    </span>
    <span>
        <button class = "btn btn-link" type="button" onclick="window.history.back()" data-toggle="tooltip" title="Cancel">Cancel</button>
    </span>
</div>