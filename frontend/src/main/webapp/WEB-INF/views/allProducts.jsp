
<div class="container"> 
		
		<div class="row">
		<!-- side bar -->
			<div class="col-md-3">
			
			<%@include file="./shared/sidebar.jsp" %>
			</div>	
			
			
			<!-- products -->
			<div class="colmd-9">
			
				<div class="row">
					<div class="colmg-12">
					
					
					<c:if test="${userClickAllProducts == true}">
					<ol class="breadcrumb">
						
							<li><a href="${conetxtRoot }/home">Home</a></li>
							<li class="active"> All Products </li>
							
						</ol>
	
					</c:if>
											
					
					<c:if test="${ userClickCategoryProducts == true}">
						<ol class="breadcrumb">
						
							<li><a href="${conetxtRoot }/home">Home</a></li>
							<li class="active">Category </li>
							<li class="active">${category.name} </li>
							
						</ol>
					</c:if>
					
					
					</div>
				</div>
			</div>	 
			
			
	</div>  
	    
</div>