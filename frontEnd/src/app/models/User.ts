export class User {
  _id: string;
  email: string;
  displayName: string;
  rol: string;
  password: string;
  phone: String

  constructor(_id="", email="", displayName="",rol="", password="", phone= ""){
      this._id =_id;
      this.email=email;
      this.displayName=displayName;
      this.rol=rol;
      this.password=password;
      this.phone = phone;
  }


}
