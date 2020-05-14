  <!-- Custom fonts for this template-->
  <link href="assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

  <!-- Page level plugin CSS-->
  <link href="assets/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="assets/css/dashboard-style.css" rel="stylesheet">
        
        <div class="row">
        	<div class="col-9">
        		<h1 id="header-row">SENG 350 Final Project</h1>
       		</div>
	       	<div class="col-3">
	       		<img src="assets/images/imabulldog-logo.jpg" id="bulldog-logo" alt="bulldog-logo" height="56" style="float: right">
       		</div>
       	</div>
       	
        <div class="row" id="buffer-row1"></div>
        
        <div class="row">
        	<p id="intro-paragraph">Hello and welcome to the SENG 350 final project presentation.  This web application is meant to be a simulation of the foundation of a property rental management application.  
        	It was built in the Eclipse IDE using a combination of Java, JavaScript, and CSS, with an SQL database to handle application data.  The Bootstrap admin template was utilized.
        	</p>
        	<p id="intro-paragraph">The application is feature incomplete and has functioned largely as a playground to enhance my understanding of HTML, CSS, and running SQL queries through Java.  
        	  Planned features include and expanded database with lease and work order information, enhanced queries for more detailed presentation, user feedback on unacceptable inputs, and improved layout and navigation.
        	</p>
        </div>
        
        <div class="row" id="buffer-row1"></div>
        
        <div class="row">
  			<div class="column" id="dashboard-column1">
  			<h2 id="subheader-2">Navigation</h2>
  				<p>Along the left edge of the page is the navigation panel.  The three horizontal bar menu icon will collapse and expand this panel.  The home icon brings you back to this welcome page, 
  				and the four categories beneath it represent the four tables currently within the database.  Clicking any of the categories will present you with the option to view the contents of that 
  				category or add a new item to that category.</p>
  			</div>
  			
  			<div class="column" id="dashboard-column2">
  				<h2 id="subheader-2">View Screens</h2>
  				<p>Any of the view screens will display all data contained with the associated database table.  On each row in these pages you will see a pencil icon at the left most end of the row.  
  				This icon takes you to the edit screen where you can alter the contents of that row.  On the tenants list there is also a clipboard icon.  This is part of a future feature that will list 
  				relevant data associated to the data row, as found through the relations to the other database tables.
  				</p>
  			</div>
  			
  			<div class="column" id="dashboard-column3">
  				<h2 id="subheader-2">Adding Items</h2>
  				<p>By navigating to one of the pages to add an item to the database you will be provided with a series of fields that compile that table.  With the exception of the owners category the last field 
  				is a foreign key that is required by the constraints within the database.  A property must have an owner, a unit must have a property, and a tenant must have a unit.  The impracticality of this design 
  				prompts a rebuild of the database with associative table to handle the relationships of the various tables.  
  				</p>
  			</div>
		</div> 
