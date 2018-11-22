<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>教务管理系统 by www.codefans.net</title>
<link rel="stylesheet" rev="stylesheet" href="css/style.css"
	type="text/css" media="all" />
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script language="JavaScript" type="text/javascript">
function tishi()
{
  var a=confirm('数据库中保存有该人员基本信息，您可以修改或保留该信息。');
  if(a!=true)return false;
  window.open("冲突页.htm","","depended=0,alwaysRaised=1,width=800,height=400,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
}

function check()
{
document.getElementById("aa").style.display="";
}
$(document).ready(function() {
	$("#pid").change(function() {
		var pid = $("#pid").val();
		confirm(pid);
		$.ajax({
			type:'post',
			url:"getCityByPid?pid="+pid,
			cache:false,
			dataType:'json',
			success: function(data){ 
				for(var i=0;i<data.length;i++){					
					$("#cityids").append("<option value="+data[i].cid+">"+data[i].cname+"</option>");
				}
			}										 						 		           
		});
	});
});
</script>
</head>
<body class="ContentBody">
	<form action="" method="post">
		<div class="MainDiv">
			<table width="99%" border="0" cellpadding="0" cellspacing="0"
				class="CContent">
				<tr>
					<th class="tablestyle_title">成绩录入页面</th>
				</tr>
				<tr>
					<td class="CPanel">

						<table border="0" cellpadding="0" cellspacing="0"
							style="width: 100%">
							<TR>
								<TD width="100%">
									<fieldset style="height: 100%;">
<legend>成绩录入</legend>
<table border="0" cellpadding="2" cellspacing="1"
	style="width: 100%">

	<tr>
		<td nowrap align="right" width="15%">省:</td>
		<td width="35%"><select name="pid" id="pid">
			<c:if test="${ not empty listPro}">
			<option selected="selected">==请选择省==</option>
			<c:forEach items="${listPro}" var="province">														
				<option value="${province.pid}">${province.pname}</option>
			</c:forEach>
			</c:if>
		</select> <span class="red">*</span></td>
		<td width="16%" align="right" nowrap="nowrap">市:</td>
		<td width="34%"><select id="cityids" name="cid">
		<option selected="selected">==请选择市==</option>
		</select></td>
	</tr>
</table>
										<br />
									</fieldset>
								</TD>
							</TR>
						</TABLE>


					</td>
				</tr>





				<TR>
					<TD colspan="2" align="center" height="50px"><input
						type="Submit" value="保存" class="button" /> <input type="button"
						name="Submit2" value="返回" class="button"
						onclick="window.history.go(-1);" /><span>${hint}</span></TD>
				</TR>
			</TABLE>


			</td>
			</tr>



			</table>

		</div>
	</form>
</body>
</html>