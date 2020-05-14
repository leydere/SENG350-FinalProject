<h1 class="page-header">Add Property</h1>

<div class="form-group col-xs-12 col-md-6">
    <label for="streetAddress">Address</label>
    <input type="text" class="form-control" id="streetAddress" autofocus required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="city">City</label>
    <input type="text" class="form-control" id="city" required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="state">State</label>
    <input type="text" class="form-control" id="state" required >
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="zipcode">Zip Code</label>
    <input type="text" class="form-control" id="zipcode" required >
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="numberOfUnits"># of Units</label>
    <input type="text" class="form-control" id="numberOfUnits" required >
</div>
<div class="form-group col-xs-12 col-md-12">
    <label for="propertyOwner">Owner ID</label>
    <input type="text" class="form-control" id="propertyOwner" autofocus required>
</div>



 <div class="form-group">
 <span>
     <button class="btn btn-primary"  type="submit" onclick="addProperty()" id="propertyAdd" data-toggle="tooltip" title="Add Property">Add Property</button>
 </span>

 <span>
     <input class = "btn btn-link" type="button" onclick="window.history.back()" value="Cancel" data-toggle="tooltip" title="Cancel">
   </span>
</div>