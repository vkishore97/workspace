import { CORE_CONCEPTS } from '../data.js';
import CoreConcept from './CoreConcept.jsx';
export default function CoreConcepts() {
    return (
        <section id="core-concepts">
            <h2>Core Concepts</h2>
            <ul>
                {/* <CoreConcepts title="Components" description="The core UI building block - compose the user interface by combining multiple components." image={componentsImg}/>
                    <CoreConcepts title={CORE_CONCEPTS[1].title} description={CORE_CONCEPTS[1].description} image={CORE_CONCEPTS[1].image}/>
                    <CoreConcepts {...CORE_CONCEPTS[2]}/>
                    <CoreConcepts {...CORE_CONCEPTS[3]}/> */
                }
            
                {CORE_CONCEPTS.map((conceptItem) => (<CoreConcept key={conceptItem.title} {...conceptItem} />))}
            </ul>
        </section>
    );
}
