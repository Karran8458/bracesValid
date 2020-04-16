function bracesValid(str) 
{
    var braces = [];
    var par = 
	{
        '(': ')',
        '[': ']',
        '{': '}'
    }

    for (var i = 0; i < str.length; i++) 
	{

        if (str[i] === '(' || str[i] === '{' || str[i] === '[' ) 
		{
            braces.push(str[i]);
        }
        else 
		{
            var last = braces.pop();
            if (str[i] !== par[last]) 
			{
			return false
			}
        }
    }
	if (braces.length !== 0) 
	{
		return false
	}
    return true;
}
