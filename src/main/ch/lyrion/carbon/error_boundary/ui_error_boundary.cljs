(ns ch.lyrion.carbon.error-boundary.ui-error-boundary
  (:require
    [ch.lyrion.carbon.factory-helpers :as h]
    ["carbon-components-react/lib/components/ErrorBoundary/ErrorBoundary.js" :default ErrorBoundary]))

(def ui-error-boundary

"React introduced additional lifecycle methods in v16 for capturing errors
that occur in a specific sub-tree of components. This component helps to
consolidate some of the duplication that occurs when using these lifecycle
methods across a codebase. In addition, it allows you to specify the fallback
UI to display when an error occurs in the sub-tree through the `fallback`
prop.

This component roughly follows the React.js docs example code for these
methods. In addition, it takes advantage of an `ErrorBoundaryContext` so that
consumers can specify their own logic for logging errors. For example,
reporting an error in the UI to an external service for every `ErrorBoundary`
used.

Reference:
https://reactjs.org/docs/error-boundaries.html#introducing-error-boundaries
Props:
  - children (node):   
  - fallback (node):   
"
  (h/factory-apply ErrorBoundary))