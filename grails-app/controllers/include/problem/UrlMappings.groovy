package include.problem

class UrlMappings {

    static mappings = {

        "/hello"(controller: 'helloWorld', action: 'hello')
        "/world"(controller: 'helloWorld', action: 'world')

//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
//                // apply constraints here
//            }
//        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
