import React, { useState } from "react";
import "./nav.scss";
import LoginMenu from "./loginMenu/loginMenu"
import Hamburger from "./hamburger/hamburger"
import logoImage from "./logo.png";
import userIcon from "./user.png";
import hamburgerIcon from "./hamburger.png";

const Nav = () => {
  const [loginWindow, setLoginWindow] = useState(false);
  const [hamburgerWindow, setHamburgerWindow] = useState(false);

  const handleClick = e =>{
    if(e.target.getAttribute('forComponent') === "LoginWindow"){
      setHamburgerWindow(false);
      setLoginWindow(!loginWindow);
    }else{
      setLoginWindow(false);
      setHamburgerWindow(!hamburgerWindow);
    }
  }

  return (
    <div className="Navigation">
      <img src={logoImage} className="Navigation__logo" alt=""/>
      <input type="text" className="Navigation__searchInput"/>
      <button className="Navigation__btn" forComponent="LoginWindow" onClick={handleClick}>
        <img src={userIcon} className="Navigation__icon" alt="" forComponent="LoginWindow"/>
      </button>
      <button className="Navigation__btn" forComponent="HamburgerWindow" onClick={handleClick}>
        <img src={hamburgerIcon} className="Navigation__icon" alt="" forComponent="HamburgerWindow"/>
      </button>
      <LoginMenu display={loginWindow} />
      <Hamburger display={hamburgerWindow}/>
    </div>
  )
};

export default Nav;