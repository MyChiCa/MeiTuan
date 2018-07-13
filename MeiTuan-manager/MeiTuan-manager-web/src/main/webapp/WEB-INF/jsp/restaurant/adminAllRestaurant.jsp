<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台管理</title>
<meta name="description" content="">
<meta name="author" content="templatemo">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,700'
	rel='stylesheet' type='text/css'>
<!-- JS -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-1.11.2.min.js"></script>
<link href="${pageContext.request.contextPath}/css/font-awesome.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/css/templatemo-style.css"
	rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/sweetalert.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/sweetalert.css">
<style>
.show-span {
	border: none !important;
}
</style>
</head>
<body>

	<%--修改商品信息模态框--%>
	<!-- Modal -->
	<div class="modal fade" id="updateRest" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改商家信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="edit_Rstr_form" name="update-form"
						method="post">
						<input type="hidden" id="edit_rstrId" name="rstrId"/>
							<div class="form-group">
							<label for="edit_foodImage" class="col-sm-2 control-label">图片</label>
							<div class="col-sm-9">
								<img id="edit_rstrImage" name="rstrImage" height="70" width="110" src="rstrImage">
							</div>
						 </div>
						 
					<div class="form-group">
                        <div class="col-lg-12">
                            <label class="col-sm-2 control-label">       </label>
                            <!-- <input type="file" name="fileToUpload" id="fileToUpload" class="margin-bottom-10"> -->
                            <input type="file" name="fileToUpload" id="fileToUpload" class="filestyle" data-buttonName="btn-primary" data-buttonBefore="true" data-icon="false" multiple="multiple">
                            <!-- <p>Maximum upload size is 5 MB.</p>  -->
                        </div>
                    </div>
						<div class="form-group">
							<label for="edit_rstrName" class="col-sm-2 control-label">店铺名</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="rstrName"
									id="edit_rstrName">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_telephone" class="col-sm-2 control-label">电话</label>
							<div class="col-sm-9">
								<input type="text" class="form-control" name="telephone"
									id="edit_telephone">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_takeTime" class="col-sm-2 control-label">配送时间</label>
							<div class="col-sm-9">
								<input type="number" class="form-control" name="takeTime"
									id="edit_takeTime">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_btakeFare" class="col-sm-2 control-label">起送费用</label>
							<div class="col-sm-9">
								<input type="number" class="form-control" id="edit_btakeFare" name="btakeFare">
							</div>
						</div>
						<div class="form-group">
							<label for="edit_takeFare" class="col-sm-2 control-label">配送费用</label>
							<div class="col-sm-9">
								<textarea class="form-control" id="edit_takeFare"
									name="takeFare"></textarea>
							</div>
						</div>
					
						<div class="form-group">
							<label for="edit_workTime" class="col-sm-2 control-label">工作时间</label>
							<div class="col-sm-9">
								<textarea class="form-control" id="edit_workTime"
									name="workTime"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="menuName" class="col-sm-2 control-label">类型</label>
							<div class="col-sm-9">
								<select class="form-control" id="edit_typeId" name="typeId">
								<c:forEach items="${sessionScope.typeList}" var="item"> 
                                    <option value="${item.typeId}"<c:if test="${item.typeId == typeId }">selected="selected"</c:if>>${item.rstrType}</option>  
                                </c:forEach> 
								</select>
							</div>
						</div>
						
						<div class="form-group">
							<label for="edit_description" class="col-sm-2 control-label">描述</label>
							<div class="col-sm-9">
								<textarea class="form-control" id="edit_description"
									name="takeFare"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label for="edit_address" class="col-sm-2 control-label">地址</label>
							<div class="col-sm-9">
								<textarea class="form-control" id="edit_address"
									name="address"></textarea>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" onclick="updateRstr()" id="saveUpdate">保存</button>
				</div>
			</div>
		</div>
	</div>
	<div id=total name=total>
		<!-- Left column -->
		<div class="templatemo-flex-row">
			<jsp:include page="../sidebar.jsp" />
			<!-- Main content -->
			<div class="templatemo-content col-1 light-gray-bg">
				<jsp:include page="restaurantNav.jsp" />
				<div class="templatemo-content-container">
					<div class="templatemo-content-widget no-padding">
						<div class="panel panel-default table-responsive">
							<table id="RstrInfo"
								class="table table-striped table-bordered templatemo-user-table">
								<thead>
									<tr>
										<td><a href="" class="white-text templatemo-sort-by">id<span
												class="caret"></span></a></td>
										<td><a href="" class="white-text templatemo-sort-by">店铺名<span
												class="caret"></span></a></td>
										<td><a href="" class="white-text templatemo-sort-by">电话<span
												class="caret"></span></a></td>
										<td><a href="" class="white-text templatemo-sort-by">地址<span
												class="caret"></span></a></td>
										<td>维护</td>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${requestScope.pages.getList()}" var="rest"
										varStatus="num">
										<tr>
											<td>${rest.rstrId}</td>
											<td>${rest.rstrName}</td>
											<td>${rest.telephone}</td>
											<td>${rest.address}</td>
											<td>
												<a href="" data-toggle="modal" data-target="#updateRest" onclick="editRestInfo(${rest.rstrId})">编辑</a>
												<a href="${pageContext.request.contextPath}/restaurant/delete?rstrId=${rest.rstrId}" onclick="return confirm('确定删除?');">删除</a>
												<a href="http://localhost:8080/business//businessManager" onclick="">进入</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>

							<div class="message">
								共<i class="blue">${requestScope.pages.total}</i>条记录，当前显示第&nbsp;<i
									class="blue">${requestScope.pages.pageNum}/${requestScope.pages.pages}</i>&nbsp;页
							</div>
							<div style="text-align:center;">
								<ul class="pagination">
									<c:if test="${!requestScope.pages.isFirstPage}">
										<li><a
											href="javascript:queryAllPerson(${requestScope.pages.firstPage}, ${requestScope.pages.pageSize});">首页</a></li>
										<li><a
											href="javascript:queryAllPerson(${requestScope.pages.prePage}, ${requestScope.pages.pageSize});">上一页</a></li>
									</c:if>
									<c:forEach items="${requestScope.pages.navigatepageNums}"
										var="navigatepageNum">

										<c:if test="${navigatepageNum==requestScope.pages.pageNum}">
											<li class="active"><a
												href="javascript:queryAllPerson(${navigatepageNum}, ${requestScope.pages.pageSize});">${navigatepageNum}</a></li>
										</c:if>
										<c:if test="${navigatepageNum!=requestScope.pages.pageNum}">
											<li><a
												href="javascript:queryAllPerson(${navigatepageNum}, ${requestScope.pages.pageSize});">${navigatepageNum}</a></li>
										</c:if>
									</c:forEach>
									<c:if test="${!requestScope.pages.isLastPage}">
										<li><a
											href="javascript:queryAllPerson(${requestScope.pages.nextPage}, ${requestScope.pages.pageSize});">下一页</a></li>
										<li><a
											href="javascript:queryAllPerson(${requestScope.pages.lastPage}, ${requestScope.pages.pageSize});">最后一页</a></li>
									</c:if>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="path" style="display: none;">${pageContext.request.contextPath}</div>
	<!-- jQuery -->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/templatemo-script.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {});
		function queryAllPerson(pageNum, pageSize) {
			$("#total").load("http://localhost:8083/restaurant/showData?pageNum=" + pageNum + "&pageSize=" + pageSize);
		}
	</script>
	<script>
		$(document).ready(function() {
			var imageUrl = $('img.content-bg-img').attr('src');
			$('.templatemo-content-img-bg').css('background-image', 'url(' + imageUrl + ')');
			$('img.content-bg-img').hide();
		});
	</script>
    <script type="text/javascript">
		 function editRestInfo(rstrId) {
			$.ajax({ 
				type:"get",
				url:"http://localhost:8083/restaurant/showById?ran=Match.Random()",
				data:{"rstrId":rstrId},
				success:function(data) {
                    $("#edit_rstrId").val(data.rstrId);
					$("#edit_rstrName").val(data.rstrName);
					$("#edit_telephone").val(data.telephone);
					$("#edit_btakeFare").val(data.btakeFare);
					$("#edit_takeFare").val(data.takeFare);
					$("#edit_address").val(data.address);
					$("#edit_workTime").val(data.workTime);
					$("#edit_description").val(data.description);
					$("#edit_takeTime").val(data.takeTime);	
					$("#edit_typeId").val(data.typeId);
					$("#edit_rstrImage").attr("src",data.rstrImage);
					
			       	
				}
			});
			}
			
			function updateRstr(){
			    filePostName:"uploadFile"
			    uploadJson:"/imageServer",
			    dir:"image"
			    $.post("${pageContext.request.contextPath}/restaurant/updateRstr",$("#edit_Rstr_form").serialize(),function(data){
				alert("客户信息更新成功！");
				window.location.reload();
			});
		}
		
		     function insertRstr(){
		         $.post("${pageContext.request.contextPath}/restaurant/insert",$("#insert_Rstr_form").serialize(),function(data){
		         alert("新增用户信息成功");
		         window.location.reload();
		     });
		   }
</script>
</body>
</html>
