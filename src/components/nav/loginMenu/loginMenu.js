import "./loginMenu.scss";
import loginImage from "./login.png";
import registerImage from "./register.png";

const LoginMenu = ({display}) => {
    const loginMenu = document.querySelector(".LoginMenu");
    display ? loginMenu.style.display = "grid" : loginMenu.style.display = "none";

  return (
    <div className="LoginMenu">
        <div className="LoginMenu__container">
            <button className="LoginMenu__btn">
                <img src={loginImage} className="LoginMenu__image" alt="" />
            </button>
            <h3>Zaloguj się</h3>
        </div>
        <div className="LoginMenu__container">
            <button className="LoginMenu__btn">
                <img src={registerImage} className="LoginMenu__image" alt="" />
            </button>
            <h3>Załóż kontro</h3>
        </div>
    </div>
  )
};

export default LoginMenu;
