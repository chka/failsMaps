package failsmaps

import com.example.*

class BootStrap {

    def init = { servletContext ->
      Person p = new Person()
      p.name = "John Doe"
      p.prefs = ["v":'{"fname": "John", "lname": "Doe"}']
      p.save()
    }
    def destroy = {
    }
}
