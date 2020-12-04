import "./footer.scss";
import facebookIcon from './facebook.png';
import twitterIcon from './twitter.png';
import instagramIcon from './instagram.png';

const Footer = () => {
  return (
    <div className="Footer">
      <input type="text" className="Footer__searchInput"/>
      <ul className="Footer__menu">
        <li className="menu__item">The Newest News</li>
        <li className="menu__item">Sport</li>
        <li className="menu__item">Polityka</li>
        <li className="menu__item">Rozrywka</li>
        <li className="menu__item">Zdrowie</li>
        <li className="menu__item">Technologia</li>
        <li className="menu__item">Biznes</li>
      </ul>
      <div className="Footer__credits">
        <div className="creadits__container">
          <h3 className='credits__header'>Frontend:</h3>
          <p className='credits__name'>Patryk Trela</p>
          <p className='credits__name'>Konrad</p>
        </div>
        <div className="creadits__container">
          <h3 className='credits__header'>Backend:</h3>
          <p className='credits__name'>Janusz Programowania</p>
          <p className='credits__name'>Tomek</p>
          <p className='credits__name'>Jacek</p>
        </div>
        <div className="creadits__container">
          <h3 className='credits__header'>Źródła:</h3>
          <p className='credits__name'><div>Icons made by <a href="https://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon">www.flaticon.com</a></div></p>
        </div>
      </div>
      <div className='Footer__follow'>
        <h3 className='follow__header'>Śledź nas</h3>
        <div className='follow__icons'>
          <img src={facebookIcon} className='icons__icon' alt=''/>
          <img src={twitterIcon} className='icons__icon' alt=''/>
          <img src={instagramIcon} className='icons__icon' alt=''/>
        </div>
      </div>
      <div className='Footer__links'>
        <span className='links__text'>&copy; 2020 The Newest News Developer Team</span>
        <a href="#PlikRegulaminu" className='links__text'>Regulamin świadczenia usług</a>
        <a href="#PlikPolityka" className='links__text'>Polityka Prywatności</a>
      </div>
    </div>
  );
};

export default Footer;
