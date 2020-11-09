import React, {useEffect} from "react"
import "./hamburger.scss";
import facebookIcon from "./facebook.png"
import twitterIcon from "./twitter.png"
import instagramIcon from "./instagram.png"

const Hamburger = ({display}) => {
  useEffect(() => { 
    const hamburger = document.querySelector(".Hamburger");
    display ? hamburger.style.display = "grid" : hamburger.style.display = "none";
  })
  return (
    <div className="Hamburger">  
      <ul className="Hamburger__menu">
        <li className="menu__item">The Newest News</li>
        <li className="menu__item">Sport</li>
        <li className="menu__item">Polityka</li>
        <li className="menu__item">Rozrywka</li>
        <li className="menu__item">Zdrowie</li>
        <li className="menu__item">Technologia</li>
        <li className="menu__item">Biznes</li>
      </ul>
      
      <div className="Hamburger__footer">
        <img src={facebookIcon} className="hamburger__image" alt=""/>
        <img src={twitterIcon} className="hamburger__image" alt=""/>
        <img src={instagramIcon} className="hamburger__image" alt=""/>
      </div>
    </div>
  );
};

export default Hamburger;
