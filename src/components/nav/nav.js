import "./nav.scss";
import userIcon from './user.png';
import hamburgerIcon from './hamburger.png';
import logoImage from './logo.png';

const Nav = () => {
  return (
    <div className="Navigation">
      <img src={logoImage} className="logo" alt="Logo"/>
      <input type="text" className="searchInput" placeholder="Szukaj"/>
      <button className="navBtn">
        <img src={userIcon} class="navIcon" alt="User" />
      </button>
      <button className="navBtn">
        <img src={hamburgerIcon} class="navIcon" alt="Menu" />
      </button>
    </div>
  )
};

export default Nav;
