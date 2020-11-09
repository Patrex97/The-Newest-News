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

  return (
    <div className="Navigation">
      <img src={logoImage} className="Navigation__logo" alt=""/>
      <input type="text" className="Navigation__searchInput"/>
      <button className="Navigation__btn" onClick={() => setLoginWindow(!loginWindow)}>
        <img src={userIcon} className="Navigation__icon" alt=""/>
      </button>
      <button className="Navigation__btn" onClick={() => setHamburgerWindow(!hamburgerWindow)}>
        <img src={hamburgerIcon} className="Navigation__icon" alt=""/>
      </button>
      <LoginMenu display={loginWindow} />
      <Hamburger display={hamburgerWindow}/>
    </div>
  )
};

export default Nav;
