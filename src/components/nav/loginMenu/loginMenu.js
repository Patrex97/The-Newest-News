import React, {useEffect} from "react"
import "./loginMenu.scss";
import loginImage from "./login.png";
import registerImage from "./register.png";

const LoginMenu = ({display}) => {
    useEffect(() => { 
        const loginMenu = document.querySelector(".LoginMenu");
        if(display ){
            loginMenu.classList.add("showMenu");
            // loginMenu.classList.remove("hideMenu");
        }else{
            // loginMenu.classList.add("hideMenu");
            loginMenu.classList.remove("showMenu");
        }
    })
  return (
    <div className="LoginMenu hideMenu">
        <div className="LoginMenu__main">
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
    </div>
  )
};

export default LoginMenu;
