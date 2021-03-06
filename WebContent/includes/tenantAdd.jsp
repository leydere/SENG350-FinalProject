<h1 class="page-header">Add Tenant</h1>

<div class="form-group col-xs-12 col-md-6">
    <label for="firstName">First Name</label>
    <input type="text" class="form-control" id="firstName" autofocus required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="lastName">Last Name</label>
    <input type="text" class="form-control" id="lastName" required>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="phoneNumber">Phone #</label>
    <input type="text" class="form-control" id="phoneNumber" required >
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="email">Email</label>
    <input type="text" class="form-control" id="email" required >
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="SSN">SSN</label>
    <input type="text" class="form-control" id="SSN" required >
</div>
<div class="form-group col-xs-12 col-md-12">
    <label for="tenantUnit">Unit ID</label>
    <input type="text" class="form-control" id="tenantUnit" autofocus required>
</div>



 <div class="form-group">
 <span>
     <button class="btn btn-primary"  type="submit" onclick="addTenant()" id="tenantAdd" data-toggle="tooltip" title="Add Tenant">Add Tenant</button>
 </span>

 <span>
     <input class = "btn btn-link" type="button" onclick="window.history.back()" value="Cancel" data-toggle="tooltip" title="Cancel">
   </span>
</div>