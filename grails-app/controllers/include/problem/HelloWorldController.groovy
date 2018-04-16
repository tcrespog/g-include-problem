package include.problem

class HelloWorldController {

    def hello() {
        render(view: 'helloWorld')
    }

    def world() {
        render(text: 'world')
    }
}
