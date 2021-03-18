console.log('JavaScript executing...');

// log values from owner object passed from Java
console.log('Owner name direct : '+owner.name);
console.log('Owner name getter : '+owner.getName());
console.log('Owner id direct: '+owner.id); // Private member, access not allowed
console.log('Owner id getter: '+owner.getId());

// Create a new Employee object
console.log('Creating a new Employee object in JavaScript');
newEmp = services.createEmployee('101','A NEW EMPLOYEE!');

// Log values of the newly created employee
console.log('New employee id : '+newEmp.getId());
console.log('New employee name : '+newEmp.getName());
