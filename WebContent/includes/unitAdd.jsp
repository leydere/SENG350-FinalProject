<h1 class="page-header">Add Unit</h1>

<div class="form-group col-xs-12 col-md-6">
    <label for="unitNumber">Unit #</label>
    <input type="text" class="form-control" id="unitNumber" autofocus>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="rentRate">Rent Rate</label>
    <input type="text" class="form-control" id="rentRate" required>
</div>
<div class="form-group col-xs-12 col-md-12">
    <label for="unitProperty">Property ID</label>
    <input type="text" class="form-control" id="unitProperty" autofocus required>
</div>



 <div class="form-group">
 <span>
     <button class="btn btn-primary"  type="submit" onclick="addUnit()" id="unitAdd" data-toggle="tooltip" title="Add Unit">Add Unit</button>
 </span>

 <span>
     <input class = "btn btn-link" type="button" onclick="window.history.back()" value="Cancel" data-toggle="tooltip" title="Cancel">
   </span>
</div>