var Singleton = (function () {
    var instance;
 
    function createInstance() {
        var object = new Object("Instância única");
        return object;
    }
 
    return {
        getInstance: function () {
            if (!instance) {
                instance = createInstance();
            }
            return instance;
        }
    };
})();

module.exports = Singleton;