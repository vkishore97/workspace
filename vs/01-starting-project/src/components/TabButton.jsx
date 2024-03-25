export default function TabButton({ children, onSelect, isSelected }) {
    
    // function handleClick() {
    //     const arr = ['vimal', 'kishore', 'harshit'];

    //     function getRandomInt(max) {
    //         return Math.floor(Math.random() * (max + 1));
    //     }

    //     console.log(arr[getRandomInt(2)]);       
    // }

    return (
        
        <li>
            <button className={ isSelected ? 'active' : undefined } onClick={onSelect} >{children}</button>
        </li>
    );

}