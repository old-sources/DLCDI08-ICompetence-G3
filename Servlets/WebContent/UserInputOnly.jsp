<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<input type="hidden" name="numUtilisateur" value="${utilisateur.num }"></input>
<div id="nom_util">
	Nom : <input type="text" name="nom" value="${utilisateur.nom}"></input>
						</div>
						<div id="prenom_util">
							Pr�nom : <input type="text" name="prenom" value="${utilisateur.prenom}"></input>
						</div>
						<div id="date_nais_util">
							Date de naissance :<input type="text" name="dateNaissance" value="${utilisateur.dateNaissance}"></input>
						</div>
						<div id="adresse_util">
							Adresse : <input type="text" name="adresse" value="${utilisateur.adresse}"></input>
						</div>
						<div id="tel_util">
							T�l�phone :<input type="text" name="tel" value="${utilisateur.tel}"></input>
						</div>
						<div id="mail_util">
							Adresse mail : <input type="text" name="mail" value="${utilisateur.mail}"></input>
						</div>
						<div id="promotion_util">
							Promotion : <select name="promotion">
										<c:forEach var="promotion" items="${ListePromo}">
										<%-- <c:if test="${utilisateur.promotion.num eq promotion.num}">--%>
										<option selected="selected" value="${promotion.num}">${promotion.intitule} ${promotion.annee}</option>
										<%--</c:if> --%>
										</c:forEach>
										</select>
							<%-- <input type="text" name="promotion" value="${utilisateur.promotion.intitule} ${utilisateur.promotion.annee}"></input>--%>
						</div>
						<div id="login_util">
							Login : <input type="text" name="login" value="${utilisateur.login}"></input>
						</div>
						<div id="password_util">
							Password : <input type="text" name="password" value="${utilisateur.password}"></input>
						</div>
					