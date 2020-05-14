<h1 class="page-header">Edit Unit</h1>

<div class="form-group col-xs-12 col-md-6">
        <label for="unitNumber">Unit #</label>
        <input type="text" class="form-control" id="unitNumber" value="" required autofocus>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="rentRate">Rent Rate</label>
    <input class="form-control" id="rentRate" required></input>
</div>
<div class="form-group col-xs-12 col-md-6">
    <label for="unitProperty">Property ID</label>
    <input type="text" class="form-control" id="unitProperty" autofocus required>
</div>


<div class="form-group col-xs-12">
    <span>
        <button class="btn btn-primary" type="submit" onclick=updateUnit(); data-toggle="tooltip" title="Save Changes">Save Changes</button>
    </span>
    <span>
        <button class = "btn btn-link" type="button" onclick="window.history.back()" data-toggle="tooltip" title="Cancel">Cancel</button>
    </span>
</div>