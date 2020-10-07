const subject = require('./subject')
const observers = require('./observers')

subject.subscribe(observers.observer1);
subject.subscribe(observers.observer2);
subject.subscribe(observers.observer3);

subject.unsubscribe(observers.observer2);

subject.fire();