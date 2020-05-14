<%@include file=".\includes\adminHeader.jsp" %>

<%@include file=".\includes\adminNavigation.jsp" %>

<div class="container-fluid">

<%
	if(view == null){
		view = "";
	}

	if(view.equals("ownerlist")){ %>
		<%@include file=".\includes\ownerList.jsp" %>
	<%}else if(view.equals("owneredit")){ %>
		<%@include file=".\includes\ownerEdit.jsp" %>
	<%}else if(view.equals("owneradd")){ %>
		<%@include file=".\includes\ownerAdd.jsp" %>
	<%}else if(view.equals("propertylist")){ %>
		<%@include file=".\includes\propertyList.jsp" %>
	<%}else if(view.equals("propertyedit")){ %>
		<%@include file=".\includes\propertyEdit.jsp" %>
	<%}else if(view.equals("propertyadd")){ %>
		<%@include file=".\includes\propertyAdd.jsp" %>
	<%}else if(view.equals("unitlist")){ %>
		<%@include file=".\includes\unitList.jsp" %>
	<%}else if(view.equals("unitedit")){ %>
		<%@include file=".\includes\unitEdit.jsp" %>
	<%}else if(view.equals("unitadd")){ %>
		<%@include file=".\includes\unitAdd.jsp" %>
	<%}else if(view.equals("tenantlist")){ %>
		<%@include file=".\includes\tenantList.jsp" %>
	<%}else if(view.equals("tenantedit")){ %>
		<%@include file=".\includes\tenantEdit.jsp" %>
	<%}else if(view.equals("tenantadd")){ %>
		<%@include file=".\includes\tenantAdd.jsp" %>
	<%}else if(view.equals("tenantinfo")){ %>
		<%@include file=".\includes\tenantInfo.jsp" %>
	<%}else{ %>
	<%@include file=".\includes\dashboard.jsp" %>
	<%} %>

</div><!-- /.container-fluid -->

<%@include file=".\includes\adminFooter.jsp" %> 