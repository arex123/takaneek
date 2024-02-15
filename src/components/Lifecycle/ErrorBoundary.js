import React from "react";
class ErrorBoundary extends React.Component {
    state = {
        error: ""
    }

    static getDerivedStateFromError(error) {
        console.log("get derived state from error");
        return {
            error: error
        }
    }

    componentDidCatch(error, info) {
        console.log("component did catch");
        console.log('error is: ', error);
        console.log('info is: ', info);

    }

    render() {

        if (this.state.error) {

            return (
                //this below thing/UI will be shown error in perticular component
                <div>
                    <h2>Some Error Occured...</h2>
                    <p>info: {(this.state.error).toString()}</p>
                </div>
                )
        }

        //if error didn't occured then show as usual component
        return this.props.children

    }

}

export default ErrorBoundary