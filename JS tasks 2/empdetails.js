let employees = [
    {
        EMPID: 'E001',
        EMPNAME: 'John Doe',
        EMPSALARY: 50000,
        EMPDESIGNATION: 'Software Engineer'
    },
    {
        EMPID: 'E002',
        EMPNAME: 'Jane Smith',
        EMPSALARY: 60000,
        EMPDESIGNATION: 'Project Manager'
    },
    {
        EMPID: 'E003',
        EMPNAME: 'Michael Brown',
        EMPSALARY: 55000,
        EMPDESIGNATION: 'UX Designer'
    }
];

employees.forEach(employee => {
    console.log(`EMPID: ${employee.EMPID}`);
    console.log(`EMPNAME: ${employee.EMPNAME}`);
    console.log(`EMPSALARY: ${employee.EMPSALARY}`);
    console.log(`EMPDESIGNATION: ${employee.EMPDESIGNATION}`);
    console.log(''); 
});
