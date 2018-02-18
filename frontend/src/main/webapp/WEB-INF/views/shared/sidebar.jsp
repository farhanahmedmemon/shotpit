<h4 class="my-4">Shop Name</h4>

<div class="list-group">

	<c:forEach items="${cat}" var="category">
	
			<a href="${contextRoot} }/show/category/${category.id} }/products" class="list-group-item">${category.name}</a> 		
	</c:forEach>

</div>