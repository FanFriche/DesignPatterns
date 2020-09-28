let instance;

module.exports = {
    getInstance: function () {
        if (!instance) {
            instance = new Object("Instância única");
        }
        return instance;
    }
}