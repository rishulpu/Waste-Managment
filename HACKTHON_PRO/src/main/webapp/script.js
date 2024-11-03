
function showLogin() {
    document.getElementById("loginForm").classList.add("active");
    document.getElementById("registerForm").classList.remove("active");
    document.getElementById("login").classList.add("active");
    document.getElementById("register").classList.remove("active");
}

function showRegister() {
    document.getElementById("loginForm").classList.remove("active");
    document.getElementById("registerForm").classList.add("active");
    document.getElementById("login").classList.remove("active");
    document.getElementById("register").classList.add("active");
}

showLogin();
