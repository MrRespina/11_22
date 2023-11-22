/** 1. 전부 빈칸 X
	2. id는 영어만
	3. pw와 pwChk는 같아야 함.
	4. 사진은 png, jpg, gif만 가능.
 * 
 */
function goSignUp() {

	location.href = "SignUpController";

}

function checkSingUp() {

	let m_id = document.singUpForm.m_id;
	let m_pw = document.singUpForm.m_pw;
	let m_pw_check = document.singUpForm.m_pw_check;
	let m_name = document.singUpForm.m_name;
	let m_phone = document.singUpForm.m_phone;
	let m_y = document.singUpForm.m_y;
	let m_m = document.singUpForm.m_m;
	let m_d = document.singUpForm.m_d;
	let m_photo = document.singUpForm.m_photo;
	let m_birth = m_y.value + m_m.value + m_d.value;

	if (isEmpty(m_id)) {
		m_id.value = "";
		m_id.focus;
		alert('id를 입력해주세요!');
		return false;
	} else if (containsAnother(m_id)) {
		m_id.value = "";
		m_id.focus;
		alert('id는 영문만 입력해주세요!');
		return false;
	} else if (isEmpty(m_pw)) {
		m_pw.value = "";
		m_pw.focus;
		alert('password를 입력해주세요!');
		return false;
	} else if (isEmpty(m_pw_check)) {
		m_pw_check.value = "";
		m_pw_check.focus;
		alert('password 확인을 입력해주세요!');
		return false;
	} else if(notEqualPw(m_pw,m_pw_check)){
		m_pw_check.value = "";
		m_pw_check.focus;
		alert('password와 password 확인이 맞지 않습니다!');
		return false;
	} else if (isEmpty(m_name)){
		m_name.value = "";
		m_name.focus;
		alert('이름을 입력해주세요!');
		return false;
	} else if (isEmpty(m_phone)){
		m_phone.value = "";
		m_phone.focus;
		alert('전화번호를 입력해주세요!');
		return false;
	}  else if (isEmpty(m_photo)){
		m_photo.value = "";
		m_photo.focus;
		alert('사진을 등록해주세요!');
		return false;
	} else if(isNotType(m_photo,'png') && isNotType(m_photo,'jpg') && isNotType(m_photo,'gif')){
		m_photo.value = "";
		m_photo.focus;
		alert('사진 파일의 확장자는 png,jpg,gif만 등록 가능합니다!');
		return false;
	}
}