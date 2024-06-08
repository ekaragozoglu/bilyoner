function fn() {
    var env = karate.env;
    if (!env) {
        env = 'dev';
    }
    var config = {
        baseUrl: 'https://dummy.restapiexample.com/',
        employeesPath: 'api/v1/employees'
    }
    if (env == 'dev') {

    } else if (env == 'e2e') {
    }
    karate.configure('connectTimeout', 9000);
    karate.configure('readTimeout', 9000);
    karate.configure('logPrettyResponse', true);
    karate.configure('logPrettyRequest', true);
    return config;
}
