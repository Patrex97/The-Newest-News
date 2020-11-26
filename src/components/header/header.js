import "./header.scss";
import headerTestImage from "./haader_test_image.jpg";

const Header = () => {
  return (
    <div className="Header">
        <button className="Header__button">
          <img src={headerTestImage} className="Header__image" alt=""/>
        </button>
        <h2 className="Header__text">W Warszawie będzie dzisiaj jasno</h2>
    </div>
  );
};

export default Header;
