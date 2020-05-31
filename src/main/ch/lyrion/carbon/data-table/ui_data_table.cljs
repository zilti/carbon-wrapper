(ns ch.lyrion.carbon.data-table.ui-data-table
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/DataTable/DataTable.js" :default DataTable]))

(def ui-data-table

"Data Tables are used to represent a collection of resources, displaying a
subset of their fields in columns, or headers. We prioritize direct updates
to the state of what we're rendering, so internally we end up normalizing the
given data and then denormalizing it when rendering.

As a result, each part of the DataTable is accessible through look-up by id,
and updating the state of the single entity will cascade updates to the
consumer.
Props:
  - overflowMenuOnHover (bool): Specify whether the overflow menu (if it exists) should be shown always, or only on hover Default: true 
  - translateWithId (func): Optional method that takes in a message id and returns an
internationalized string. See `DataTable.translationKeys` for all
available message ids. Default: id => defaultTranslations[id] 
  - radio (bool): Specify whether the control should be a radio button or inline checkbox  
  - locale (string): Provide a string for the current locale Default: 'en' 
  - stickyHeader (bool): Specify whether the header should be sticky.
Still experimental: may not work with every combination of table props  
  - isSortable (bool): Specify whether the table should be able to be sorted by its headers  
  - size (enum): `normal` Change the row height of table Default: 'normal' 
  - headers (arrayOf) (required): The `headers` prop represents the order in which the headers should
appear in the table. We expect an array of objects to be passed in, where
`key` is the name of the key in a row object, and `header` is the name of
the header.  
  - rows (arrayOf) (required): The `rows` prop is where you provide us with a list of all the rows that
you want to render in the table. The only hard requirement is that this
is an array of objects, and that each object has a unique `id` field
available on it.  
  - filterRows (func): Optional hook to manually control filtering of the rows from the
TableToolbarSearch component Default: defaultFilterRows 
  - sortRow (func): Optional hook to manually control sorting of the rows. Default: defaultSortRow 
"
  (h/factory-apply DataTable))