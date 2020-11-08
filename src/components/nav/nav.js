import React, { useState} from "react";
import "./nav.scss";
import LoginMenu from "./loginMenu/loginMenu"
import logoImage from "./logo.png";
import userIcon from "./user.png";
import hamburgerIcon from "./hamburger.png";

const Nav = () => {
  const [loginWindow, setloginWindow] = useState(false);

  return (
    <div className="Navigation">
      <img src={logoImage} className="Navigation__logo" alt=""/>
      <input type="text" className="Navigation__searchInput"/>
      <button className="Navigation__btn" onClick={() => setloginWindow(!loginWindow)}>
        <img src={userIcon} className="Navigation__icon" alt=""/>
      </button>
      <button className="Navigation__btn">
        <img src={hamburgerIcon} className="Navigation__icon" alt=""/>
      </button>
      <LoginMenu display={loginWindow} />
    </div>
  )
};

export default Nav;
