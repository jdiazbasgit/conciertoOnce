import axios from "axios";
export default axios.create({
  baseURL: "http://82.223.202.137:8082",
  headers: {
    "Content-type": "application/json"
  }
});
