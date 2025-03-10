import React from "react";
import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div className="container d-flex flex-column justify-content-center align-items-center text-center vh-90"><br/>
      <h1>Welcome to Jobify – Your Career Starts Here!</h1><br/>
      <strong><p>Jobify is a simple and efficient job application platform that helps you find and apply for jobs with ease.<br/> Browse through available job listings, upload your resume, and submit applications in just a few clicks.<br/> Whether you're looking for your first job or the next step in your career, Jobify makes the application process quick and hassle-free.<br/> Start applying today and take your career forward!</p></strong><br/>
      <p>🚀 Find Your Dream Job with Ease!</p>
      <p>🔹 Explore various job opportunities and apply instantly.</p>
      <p>💼 Ready to take the next step? Visit the Jobs page now!</p>
      <p>📋 Submit your job application with just a few clicks.</p>
      <p>📎 Upload your resume and increase your chances of getting hired.</p>
      <p>📝 Stay organized with a seamless application process and quick submissions.</p><br/>
      <Link to="/jobs">
        <button className="btn btn-primary mt-3">View Jobs</button>
      </Link>
    </div>
  );
};

export default Home;
